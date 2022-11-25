def call(def workspace) {
    sh "docker-composer build"
    sh "docker-compose up -d"
     }
    
