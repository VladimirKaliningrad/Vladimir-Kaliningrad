import { createRouter, createWebHistory } from 'vue-router'
import HomePage from '../views/HomePage.vue';
import Blog from '../views/Blog.vue';
import BlogDetails from '../views/BlogDetails.vue';
import Project from '../views/Project.vue';
import ProjectDetails from '../views/ProjectDetails.vue';
import NotFound from '../views/NotFound.vue';


const routes = [
  {
    path: '/',
    name: 'Home',
    component: HomePage
  },
  {
    path: '/blog',
    name: 'Blog',
    component: Blog
  },
  {
    path: '/blogdetails',
    name: 'BlogDetails',
    component: BlogDetails
  },
  {
    path: '/project',
    name: 'Project',
    component: Project
  },
  {
    path: '/projectdetails',
    name: 'ProjectDetails',
    component: ProjectDetails
  },
  {
    path: '/:CatchAll(.*)',
    name: '404',
    component: NotFound
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router;
