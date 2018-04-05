package com.ndaffern

class TeamLeaderController {

    def scaffold=TeamLeader

    def login(){

     }

   def validate(){

   def user = TeamLeader.findByUsername(params.userName)

   if (user && user.password == params.password){

           session.user = user

           render view:'home'

   }
   
   else{

         flash.message = "Invalid username and password."

         render view:'login'

      }
   }


   def logout = {

        session.user = null

        redirect(uri:'/')
}
}
