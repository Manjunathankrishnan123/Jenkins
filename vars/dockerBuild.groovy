def call(def workspace) {
    dir('workspace'){
    sh "docker compose up -d --build"
     }
    }
