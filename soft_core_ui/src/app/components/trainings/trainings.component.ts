import { Component } from '@angular/core';
import {NgForOf} from '@angular/common';

@Component({
  selector: 'app-trainings',
  imports: [
    NgForOf
  ],
  templateUrl: './trainings.component.html',
  styleUrl: './trainings.component.scss'
})
export class TrainingsComponent {

  trainingPrograms = [
    {
      title: 'Full Stack Development',
      description: 'Learn Angular, Spring Boot, MySQL, and REST APIs in this hands-on training program.',
      duration: '3 Months',
    },
    {
      title: 'Frontend Development',
      description: 'Master Angular, HTML, CSS, Bootstrap, and responsive design.',
      duration: '2 Months',
    },
    {
      title: 'Backend Development',
      description: 'Spring Boot, REST APIs, JPA, Hibernate, and Oracle/MySQL DBs.',
      duration: '2.5 Months',
    },
    {
      title: 'Internship Program',
      description: 'Work on real-time projects guided by experienced developers.',
      duration: '1-6 Months',
    },
  ];

}
