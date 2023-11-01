export default {
    state: {
      projectInfo: [
        {
          heading: 'Minimal Look Bedrooms',
          firstparagraph: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquamsem vitae turpis dignissim maximus. Aliquam sollicitudin tellumassa, vbel maximus purus posuere in. Dojrices gravida dignissim. Praesent at nibh in mi fringilla mattis. Phasellus ut dolor odio. Aenean in the ipsum vel lectus bibendum commodo.',
          secondparagraph: 'In nec sem suscipit, convallis leo vitae, lacinia nibh. Cras amet tellus lectus. Vivamus ipsum nunc, mattis quis nibh id, pellentesque arcu. Donec a pellentesque Cras erat enim, gravida non ante vitae,elequis convallis elit, in viverra felis. Donec ultrices tellus vitae iaculisvd porta. Proin tincidunt ligula id purus porttitor.'
        }
      ],
      sliderPictures: [
        { src: require('@/assets/images/project_details_slider1.png'), alt: 'slider pic' },
        { src: require('@/assets/images/project_details_slider2.png'), alt: 'slider pic' },
        { src: require('@/assets/images/project_details_slider3.png'), alt: 'slider pic' },
      ]
    },
    getters: {
      getProjectInfo(state){
          return state.projectInfo;
      },
      getSliderPictures(state){
          return state.sliderPictures;
      },
    }
  }