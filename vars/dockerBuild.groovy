def call(def workspace) {
    sh "docker compose build"
    sh "docker compose up -d"
     }
    
