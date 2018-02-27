# Play! + Vuejs + Adminlte project skelton
## New project :
- Download the Zip file of this project
- Extract it in your PC
- Rename the folder to your project name
- Edit the file `build.sbt` and update :
   - `name := ` value
   - Replace `com.iss` occurences by your package base reverse domaine name. Ex `com.company.projectname`
- Run : 
   1. Frontend :
      - `$ cd ui`   
      - `$ npm install`   
      - `$ npm run build` 
   2. Backend :
      - `$ sbt`  
      - `$ [project name] run`  
## Backend :
The backend project is based on the Scala Play! framework. It is in the root of the project. 

## Frontend :
The frontend project is located in the `ui` folder. It is based on the Vuejs 2 framework and the AdminLTE theme.

## Production :
`$ sbt clean compile stage`

The generated files will be saved in the `public/compiled` folder of the Play! project.

# TODO :
- Renable Play! filters : I disabled them to avoid an error message on the browser related to CSP.
- Add Login Form page
- Add Register page
- Add Profil page
- Add Dashboard

# Contact :
NOUNI El Bachir <nouni.elbachir@gmail.com> 
