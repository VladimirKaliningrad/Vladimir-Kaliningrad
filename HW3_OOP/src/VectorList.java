
import java.util.Iterator;

public class VectorList <E> implements Iterable<E> {
    private Node<E> node = null;
    private int counter = 0;

    public VectorList (){
        node = new Node<>();
    }

    public int size (){

        return counter;
    }
    public void add (E element){
        if(counter ==0){    //первый узел надо обработать отдельно,
                            // иначе в первом узле элемент будет балластом
            node.set(element);
        }
        else{
            node.add(element);
                    }
        counter++;          //увеличим счетчик элементов
    }
    @Override
    public Iterator <E> iterator () {
        return new VectorIterator(node);
    }
    private class Node <E> {     // узел с элементом сделан внутренним,
        //  чтобы не светить его наружу
        private E element;
        private Node<E> next = null;

        Node() {
        }

        Node(E element) {

            set(element);
        }

        void set(E element) {

            this.element = element;
        }

        void add(E element) {
            if (isNext()) {        //если существует следующий узел,
                next.add(element);//передадим ему эстафету
            } else {                 //иначе создадим следующий узел
                next = new Node<>(element);
            }
        }

        E get() {
            return element;
        }

        boolean isNext() {

            return next != null;
        }// итератор,светить наружу его тоже не хочется,
        // он слишком специфический.
    }
    private class VectorIterator implements Iterator<E>{
            private Node<E> current;
            private boolean isFirst = true; //первый узел надо обработать отдельно
            VectorIterator(Node<E> node){
                current = node;
            }
            @Override
            public boolean hasNext() {
                if (counter == 1 && isFirst) return true;//отдельно обрабатывать один элемент
                return current.isNext();                 //потому что у него нет next
            }
            @Override
            public E next(){
                if (isFirst) isFirst = false;
                else current = current.next;
                return current.get();

            }




    }




}
