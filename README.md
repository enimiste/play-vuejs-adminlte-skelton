# Play! + Vuejs + Adminlte project skelton
## Backend :
The backend project is based on the Scala Play! framework. It is in the root of the project.

### Run :
`$ sbt`  
`$ [project name] run`  

### Compile :
`$ sbt clean compile stage`

## Frontend :
The frontend project is located in the `ui` folder. It is based on the Vuejs 2 framework and the AdminLTE theme.

### Run :
`$ cd ui`   
`$ npm install`   
`$ npm run build` 

The generated files will be saved in the `public/compiled` folder of the Play! project.

# TODO :
- Renable Play! filters : I disabled them to avoid an error message on the browser related to CSP.
- Add Login Form page
- Add Register page
- Add Profil page
- Add Dashboard

# Contact :
NOUNI El Bachir <nouni.elbachir@gmail.com> 