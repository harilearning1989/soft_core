import { Component } from '@angular/core';
import {NgForOf} from '@angular/common';

@Component({
  selector: 'app-services',
  imports: [
    NgForOf
  ],
  templateUrl: './services.component.html',
  styleUrl: './services.component.scss'
})
export class ServicesComponent {

  services = [
    {
      icon: '🧑‍💻',
      title: 'Custom Software Development',
      description: 'We build tailor-made software solutions that meet your unique business needs.'
    },
    {
      icon: '🌐',
      title: 'Web Application Development',
      description: 'Robust, scalable web apps using Angular, Spring Boot, and REST APIs.'
    },
    {
      icon: '📱',
      title: 'Mobile App Development',
      description: 'Hybrid and native mobile app development for Android and iOS platforms.'
    },
    {
      icon: '🎓',
      title: 'Internship Programs',
      description: 'Real-time training and internship opportunities for students and freshers.'
    },
    {
      icon: '📚',
      title: 'Training Services',
      description: 'Hands-on training in Java, Angular, Spring Boot, Python, MySQL, and more.'
    },
    {
      icon: '🔧',
      title: 'Application Maintenance',
      description: 'We maintain, debug, and enhance existing applications efficiently.'
    },
    {
      icon: '🛠️',
      title: 'Support & Maintenance',
      description: 'We provide ongoing support and improvements for applications like Library Management, Hospital Management, and more.'
    },
    {
      icon: '🗄️',
      title: 'Database Design & Optimization',
      description: 'We structure and optimize relational and NoSQL databases for performance, scalability, and data integrity.'
    },
    {
      icon: '🚀',
      title: 'DevOps & CI/CD',
      description: 'We implement automation and deployment pipelines using GitHub, Jenkins, Docker, Kubernetes, and Linux to ensure reliable and scalable releases.'
    }
  ];

}
