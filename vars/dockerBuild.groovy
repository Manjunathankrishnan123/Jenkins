def call(def workspace) {
    sh "pip install docker-compose"
    sh "docker-compose up --build"
     }
    
