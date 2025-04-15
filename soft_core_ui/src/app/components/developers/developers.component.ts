import { Component} from '@angular/core';
import {NgForOf} from '@angular/common';

@Component({
  selector: 'app-developers',
  imports: [
    NgForOf
  ],
  templateUrl: './developers.component.html',
  styleUrl: './developers.component.scss'
})
export class DevelopersComponent {

  developers = [
    {
      name: 'Hari Duddukunta',
      role: 'Full Stack Developer',
      experience: '5+ years',
      skills: ['Angular', 'Spring Boot', 'Java', 'MySQL'],
      photo: 'https://via.placeholder.com/150'
    },
    {
      name: 'Priya Sharma',
      role: 'Frontend Developer',
      experience: '3 years',
      skills: ['Angular', 'TypeScript', 'Bootstrap'],
      photo: 'https://via.placeholder.com/150'
    },
    {
      name: 'Ravi Kumar',
      role: 'Backend Developer',
      experience: '4 years',
      skills: ['Java', 'Spring Boot', 'Oracle'],
      photo: 'https://via.placeholder.com/150'
    },
    {
      name: 'Sneha Reddy',
      role: 'UI/UX Designer',
      experience: '2 years',
      skills: ['Figma', 'Adobe XD', 'CSS'],
      photo: 'https://via.placeholder.com/150'
    },
    {
      name: 'Sneha Reddy',
      role: 'UI/UX Designer',
      experience: '2 years',
      skills: ['Figma', 'Adobe XD', 'CSS'],
      photo: 'https://via.placeholder.com/150'
    },
    {
      name: 'Sneha Reddy',
      role: 'UI/UX Designer',
      experience: '2 years',
      skills: ['Figma', 'Adobe XD', 'CSS'],
      photo: 'https://via.placeholder.com/150'
    },
    {
      name: 'Sneha Reddy',
      role: 'UI/UX Designer',
      experience: '2 years',
      skills: ['Figma', 'Adobe XD', 'CSS'],
      photo: 'https://via.placeholder.com/150'
    },
    {
      name: 'Sneha Reddy',
      role: 'UI/UX Designer',
      experience: '2 years',
      skills: ['Figma', 'Adobe XD', 'CSS'],
      photo: 'https://via.placeholder.com/150'
    }
  ];
}
