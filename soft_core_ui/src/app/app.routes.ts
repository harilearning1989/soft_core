import {Routes} from '@angular/router';

export const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {
    path: 'home',
    loadComponent: () =>
      import('./components/home/home.component').then((m) => m.HomeComponent),
  },
  {
    path: 'about',
    loadComponent: () =>
      import('./components/about/about.component').then((m) => m.AboutComponent),
  },
  {
    path: 'contact',
    loadComponent: () =>
      import('./components/contact/contact.component').then((m) => m.ContactComponent),
  },
  {
    path: 'services',
    loadComponent: () =>
      import('./components/services/services.component').then((m) => m.ServicesComponent),
  },
  {
    path: 'projects',
    loadComponent: () =>
      import('./components/projects/projects.component').then((m) => m.ProjectsComponent),
  },
  {
    path: 'developers',
    loadComponent: () =>
      import('./components/developers/developers.component').then((m) => m.DevelopersComponent),
  },
  {
    path: 'internships',
    loadComponent: () =>
      import('./components/internships/internships.component').then((m) => m.InternshipsComponent),
  },
  {
    path: 'trainings',
    loadComponent: () =>
      import('./components/trainings/trainings.component').then((m) => m.TrainingsComponent),
  },
  {
    path: '**',
    loadComponent: () =>
      import('./components/not-found/not-found.component').then((m) => m.NotFoundComponent),
  },
];

