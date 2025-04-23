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

ng build --configuration=production
ip a
hostname -I
sudo yum update -y
sudo yum install nginx -y
sudo systemctl start nginx
sudo systemctl enable nginx
sudo firewall-cmd --permanent --add-service=http
sudo firewall-cmd --reload
sudo cp -r dist/your-project-name/* /usr/share/nginx/html/
sudo vi /etc/nginx/nginx.conf

=========================================================
ng build --configuration=production
zip -r dist.zip dist/
scp dist.zip hari@192.168.64.6:/home/hari/
sudo cp -r dist/soft_core_ui/browser/* /var/www/html/
sudo nano /etc/nginx/sites-available/default
change html file
index index.html index.htm index.csr.html;
sudo systemctl restart nginx
==========================================================



server {
listen 80;
server_name your_domain_or_ip;

    location / {
        root /usr/share/nginx/html;
        index index.html;
        try_files $uri $uri/ /index.html;
    }

    error_page  404  /index.html;
}

sudo systemctl restart nginx

http://your_server_ip_or_domain

sudo tail -f /var/log/nginx/access.log
sudo tail -f /var/log/nginx/error.log



