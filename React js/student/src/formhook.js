

import React, { useState } from 'react';

import ReactDOM from 'react-dom';
import './index.css';
function LoginForm(){
  const [name,setName] = useState("");
  const [email,setEmail] = useState("");
  const [password,setPassword] = useState("");
  const [contactNumber,setcontactNumber] = useState("");
  
  
  const handleSubmit=(e)=>{
      e.preventDefault();
      console.log(email,password)
  }
  
     return(
         <form onSubmit={handleSubmit}>
           <label>User Name
            <input name="name" placeholder="Name" type="text" required value={name} onChange={setName}/><br></br>
            </label><br></br>
            <label>Email
            <input name="name" placeholder="Email" type="text" required value={email} onChange={setEmail}/><br></br>
            </label><br></br>
            <label>Password
             <input placeholder="password" type="password" required value={password} onChange={setPassword}/><br></br>
             </label><br></br>
             <label>Contact Number
             <input placeholder="number" type="number" required value={contactNumber} onChange={setcontactNumber}/><br></br>
             </label><br></br>


             
        
        
            <button>Submit</button>
         </form>
     )
  }
ReactDOM.render(  
    <LoginForm  /> ,
  document.getElementById('root')
  );



