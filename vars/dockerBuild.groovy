def call(def workspace) {
    sh '''
     pwd
     docker version
     docker info
     docker-compose version
     curl --version
     docker-compose up 
     '''
     }
    
