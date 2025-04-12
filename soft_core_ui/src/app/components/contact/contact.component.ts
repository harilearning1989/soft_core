import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-contact',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './contact.component.html',
  styleUrl: './contact.component.scss'
})
export class ContactComponent {
  contactForm: FormGroup;
  submitted = false;
  successMessage = '';

  constructor(private fb: FormBuilder, private http: HttpClient) {
    this.contactForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', [Validators.required, Validators.pattern(/^\d{10}$/)]],
      message: ['', [Validators.required, Validators.minLength(10)]],
    });
  }

  onSubmit(): void {
    this.submitted = true;
    if (this.contactForm.valid) {
      const formData = this.contactForm.value;
      this.http.post('http://localhost:8080/api/contact', formData).subscribe({
        next: () => {
          this.successMessage = 'Thank you! We received your message.';
          this.contactForm.reset();
          this.submitted = false;
        },
        error: (err) => {
          console.error('Error submitting contact form', err);
        },
      });
    }
  }

  // Optional getter for cleaner access in HTML (e.g., f['name'])
  get f() {
    return this.contactForm.controls;
  }
}
