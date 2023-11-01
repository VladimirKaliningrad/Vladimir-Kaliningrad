import { createStore } from 'vuex';
import ProjectDetailsModule from './modules/ProjectDetailsModule';
import BlogModule from './modules/BlogModule';
import ProjectModule from './modules/ProjectModule';

export default createStore({
  modules: {
    ProjectDetailsModule,
    BlogModule,
    ProjectModule
  }
})
