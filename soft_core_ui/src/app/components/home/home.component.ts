import { Component } from '@angular/core';
import {RouterLink} from '@angular/router';
import {NgForOf} from '@angular/common';

@Component({
  selector: 'app-home',
  imports: [
    RouterLink,
    NgForOf
  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

  developers = [
    {
      name: 'Hari Duddukunta',
      role: 'Full Stack Developer (Angular, Spring Boot, Oracle SQL&PLSQL, DevOps)',
      photo: 'https://via.placeholder.com/150',
    },
    {
      name: 'Anjali Rao',
      role: 'UI/UX Designer',
      photo: 'https://via.placeholder.com/150',
    },
    {
      name: 'Ravi Teja',
      role: 'Backend Developer (Spring Boot)',
      photo: 'https://via.placeholder.com/150',
    },
    {
      name: 'Sneha Reddy',
      role: 'Frontend Developer (Angular)',
      photo: 'https://via.placeholder.com/150',
    },
    {
      name: 'Kiran Kumar',
      role: 'DevOps Engineer',
      photo: 'https://via.placeholder.com/150',
    },
    {
      name: 'Meghana Patel',
      role: 'QA Engineer',
      photo: 'https://via.placeholder.com/150',
    },
    {
      name: 'Abhishek',
      role: 'Mobile App Developer (Flutter)',
      photo: 'https://via.placeholder.com/150',
    }
  ];

}
