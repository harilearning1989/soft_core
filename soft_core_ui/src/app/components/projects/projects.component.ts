import { Component } from '@angular/core';
import {NgForOf} from '@angular/common';

@Component({
  selector: 'app-projects',
  imports: [
    NgForOf
  ],
  templateUrl: './projects.component.html',
  styleUrl: './projects.component.scss'
})
export class ProjectsComponent {

  projects = [
    {
      title: 'Library Management System',
      description: 'A complete solution for managing library books, members, and issue/return operations.',
      techStack: 'Angular, Spring Boot, MySQL'
    },
    {
      title: 'Hospital Management System',
      description: 'Streamlined patient, doctor, and appointment management with secure access.',
      techStack: 'Angular, Spring Boot, Oracle'
    },
    {
      title: 'E-Commerce Platform',
      description: 'Multi-vendor online store with cart, checkout, and admin dashboard.',
      techStack: 'Angular, Node.js, MongoDB'
    },
    {
      title: 'Pharmacy Inventory',
      description: 'Stock management, medicine sale tracking, and low-stock alerting system.',
      techStack: 'Angular, Spring Boot, MySQL'
    }
  ];

}
