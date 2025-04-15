Node.js (v18+ recommended)

Angular CLI: npm install -g @angular/cli

sudo ng new soft_core_ui

ng serve

sudo npm install bootstrap

Open angular.json, and add the Bootstrap CSS file path to the styles array:

"styles": [
  "node_modules/bootstrap/dist/css/bootstrap.min.css",
  "src/styles.css"
]

Optional: If you want to use Bootstrap’s JS components, also add this to scripts:

"scripts": [
  "node_modules/bootstrap/dist/js/bootstrap.bundle.min.js"
]

ng g c components/header
ng g c components/home
ng g c components/about
ng g c components/contact
ng g c components/footer
ng g c components/services
ng g c components/projects
ng g c components/developers
ng g c components/trainings
ng g c components/internships
ng g c components/not-found


