CREATE TABLE developers
(
    developer_id     SERIAL PRIMARY KEY,
    full_name        VARCHAR(100)        NOT NULL,
    email            VARCHAR(100) UNIQUE NOT NULL,
    phone_number     VARCHAR(15),
    skills           TEXT[],
    experience_years INT CHECK (experience_years >= 0),
    is_active        BOOLEAN   DEFAULT TRUE,
    created_at       TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE projects
(
    project_id   SERIAL PRIMARY KEY,
    project_name VARCHAR(100) NOT NULL,
    description  TEXT,
    start_date   DATE,
    end_date     DATE,
    client_name  VARCHAR(100),
    status       VARCHAR(50) DEFAULT 'Ongoing',
    created_at   TIMESTAMP   DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE trainings
(
    training_id  SERIAL PRIMARY KEY,
    title        VARCHAR(100) NOT NULL,
    description  TEXT,
    trainer_name VARCHAR(100),
    start_date   DATE,
    end_date     DATE,
    mode         VARCHAR(50) CHECK (mode IN ('Online', 'Offline', 'Hybrid')),
    fee          NUMERIC(10, 2),
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE services
(
    service_id   SERIAL PRIMARY KEY,
    icon         TEXT,
    service_name TEXT,
    description  TEXT,
    category     TEXT,
    price        NUMERIC(10, 2),
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE contact
(
    contact_id   SERIAL PRIMARY KEY,
    full_name    VARCHAR(100) NOT NULL,
    email        VARCHAR(100) NOT NULL,
    phone_number VARCHAR(15),
    message      TEXT,
    submitted_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO projects (project_name, description, start_date, end_date, client_name, status)
VALUES ('Pharmacy Management System', 'Inventory and billing software for pharmacies.', '2024-01-10', '2024-04-30',
        'MediPlus Pvt Ltd', 'Completed'),
       ('Online Learning Portal', 'E-learning platform for schools.', '2024-03-01', NULL, 'EdTech Co.', 'Ongoing'),
       ('Hospital Management System', 'Manage patients, billing, and appointments.', '2024-02-15', '2024-05-10',
        'HealthPlus Ltd', 'Completed'),
       ('HR & Payroll System', 'Employee management with payroll automation.', '2024-04-01', NULL,
        'SoftTech HR Pvt Ltd', 'Ongoing'),
       ('CRM Solution', 'Customer Relationship Management tool.', '2024-05-10', NULL, 'RetailGo Inc.', 'Initiated');

INSERT INTO trainings (title, description, trainer_name, start_date, end_date, mode, fee)
VALUES ('Spring Boot with Microservices', 'Build and deploy microservices using Spring Boot.', 'Harish D.',
        '2024-05-01', '2024-05-15', 'Online', 4999.00),
       ('Angular Frontend Development', 'Frontend development using Angular 18.', 'Deepa K.', '2024-06-01',
        '2024-06-12', 'Offline', 4500.00),
       ('PostgreSQL for Developers', 'Hands-on PostgreSQL training.', 'Suresh M.', '2024-05-10', '2024-05-14', 'Online',
        3000.00),
       ('DevOps Fundamentals', 'CI/CD pipelines, Docker, and Jenkins basics.', 'Neha R.', '2024-06-20', '2024-06-30',
        'Hybrid', 5500.00),
       ('Java Backend Mastery', 'Java core + Spring Boot advanced topics.', 'Ravi K.', '2024-07-01', '2024-07-15',
        'Online', 4800.00);

INSERT INTO services (icon, service_name, description, category, price, created_at)
VALUES ('🧑‍💻', 'Custom Software Development',
        'We build tailor-made software solutions that meet your unique business needs.', 'Development', 5000.00,
        '2025-04-30 10:00:00'),
       ('🌐', 'Web Application Development', 'Robust, scalable web apps using Angular, Spring Boot, and REST APIs.',
        'Development', 4000.00, '2025-04-30 10:01:00'),
       ('📱', 'Mobile App Development', 'Hybrid and native mobile app development for Android and iOS platforms.',
        'Development', 4500.00, '2025-04-30 10:02:00'),
       ('🎓', 'Internship Programs', 'Real-time training and internship opportunities for students and freshers.',
        'Education', 0.00, '2025-04-30 10:03:00'),
       ('📚', 'Training Services', 'Hands-on training in Java, Angular, Spring Boot, Python, MySQL, and more.',
        'Education', 999.99, '2025-04-30 10:04:00'),
       ('🔧', 'Application Maintenance', 'We maintain, debug, and enhance existing applications efficiently.',
        'Maintenance', 1500.00, '2025-04-30 10:05:00'),
       ('🛠️', 'Support & Maintenance',
        'We provide ongoing support and improvements for applications like Library Management, Hospital Management, and more.',
        'Maintenance', 2000.00, '2025-04-30 10:06:00'),
       ('🗄️', 'Database Design & Optimization',
        'We structure and optimize relational and NoSQL databases for performance, scalability, and data integrity.',
        'Database', 3000.00, '2025-04-30 10:07:00'),
       ('🚀', 'DevOps & CI/CD',
        'We implement automation and deployment pipelines using GitHub, Jenkins, Docker, Kubernetes, and Linux to ensure reliable and scalable releases.',
        'DevOps', 3500.00, '2025-04-30 10:08:00');

INSERT INTO contact (full_name, email, phone_number, message)
VALUES ('Anjali Verma', 'anjali.v@example.com', '9876543210', 'Interested in Spring Boot training.'),
       ('Ramesh Kumar', 'ramesh.kumar@clientcorp.com', '9123456789', 'Need CRM system for our company.'),
       ('Sneha Joshi', 'sneha.j@techmail.com', '9812345678', 'Do you offer weekend batches?'),
       ('Vikram Patel', 'vikram.patel@xyz.com', '9900112233', 'Requesting quote for mobile app development.'),
       ('Neetu Sharma', 'neetu.sharma@webmail.com', '9870012345', 'I have a custom project requirement.');

INSERT INTO developers (full_name, email, phone_number, skills, experience_years, is_active)
VALUES ('Rahul Mehta', 'rahul.mehta@softcore.com', '9876543210', ARRAY['Java', 'Spring Boot', 'MySQL'], 4, TRUE),
       ('Anita Sharma', 'anita.sharma@softcore.com', '9123456789', ARRAY['Angular', 'TypeScript', 'Bootstrap'], 3,
        TRUE),
       ('Suresh Reddy', 'suresh.reddy@softcore.com', '9811122233', ARRAY['PostgreSQL', 'JPA', 'SQL'], 5, TRUE),
       ('Pooja Nair', 'pooja.nair@softcore.com', '9900990099', ARRAY['React', 'Node.js', 'MongoDB'], 2, FALSE),
       ('Manish Kapoor', 'manish.kapoor@softcore.com', '9001234567', ARRAY['DevOps', 'Docker', 'CI/CD'], 6, TRUE);

ALTER TABLE developers
    ADD COLUMN photo BYTEA;


