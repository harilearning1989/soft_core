import { Component } from '@angular/core';
import {NgForOf} from '@angular/common';

@Component({
  selector: 'app-internships',
  imports: [
    NgForOf
  ],
  templateUrl: './internships.component.html',
  styleUrl: './internships.component.scss'
})
export class InternshipsComponent {

  internships = [
    {
      title: 'Web Development Internship',
      techStack: 'HTML, CSS, JavaScript, Angular',
      duration: '2 Months',
      description: 'Hands-on experience building responsive websites using modern frontend technologies.',
    },
    {
      title: 'Backend Development Internship',
      techStack: 'Spring Boot, MySQL, REST APIs',
      duration: '3 Months',
      description: 'Build scalable backend services and connect to frontend using RESTful APIs.',
    },
    {
      title: 'Full Stack Internship',
      techStack: 'Angular, Spring Boot, MySQL',
      duration: '3-6 Months',
      description: 'Get complete full-stack training and work on live projects with expert mentorship.',
    }
  ];
}
