def call(def workspace) {
    dir('workspace'){
    sh "sudo docker-compose up -d --build"
     }
    }
