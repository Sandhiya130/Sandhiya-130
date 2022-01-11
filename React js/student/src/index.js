import React, { useState } from 'react';

import ReactDOM from 'react-dom';
import './index.css';
function Form() {
  
 
  const [name, setName] = useState('');
  
  const [email, setEmail] = useState('');
  
  const [password, setPassword] = useState('');
 
  
  const [submitted, setSubmitted] = useState(false);
  const [error, setError] = useState(false);
  
 
  const handleName = (e) => {
    setName(e.target.value);
    setSubmitted(false);
  };
  
 
  const handleEmail = (e) => {
    setEmail(e.target.value);
    setSubmitted(false);
  };
  

  const handlePassword = (e) => {
    setPassword(e.target.value);
    setSubmitted(false);
  };
 
  
 
  const handleSubmit = (e) => {
    e.preventDefault();
    if (name === '' || email === ''|| password === '') {
      setError(true);
    } else {
      setSubmitted(true);
      setError(false);
    }
  };
  
  
  const successMessage = () => {
    return (
      <div
        className="success"
        style={{
          display: submitted ? '' : 'none',
        }}>
        <h4>successfully registered!!!</h4>
        <h2>Welcome {name}</h2>
      </div>
    );
  };
  

  const errorMessage = () => {
    return (
      <div
        className="error"
        style={{
          display: error ? '' : 'none',
        }}>
        <h1>Please enter all the fields</h1>
      </div>
    );
  };
  
  return (
    <div className="form">
      <div>
        <h1>User Registration</h1>
      </div>
  
     
      <div className="messages">
        {errorMessage()}
        {successMessage()}
      </div>
      
  
      <form class="formcontrol"> 
        
        <labe>User Name
        <input onChange={handleName} className="input"  value={name} type="text" />
        <br></br>

        


        </labe><br></br>
        

        
      
  
        <label>Email
        <input onChange={handleEmail} className="input" value={email} type="email" /><br></br>
        </label>

        
        
        
  
  
        <label>Password <input onChange={handlePassword} className="input"   value={password} type="password" /><br></br>
        </label><br></br>
  
        <button onClick={handleSubmit} className="btn" type="submit">
          SIGN IN
        </button>
        <p> Already registered? <a href="login">Login</a>
                </p>
      </form>
    </div>
  
  );
}
  



ReactDOM.render(  
  <Form /> ,
document.getElementById('root')
);