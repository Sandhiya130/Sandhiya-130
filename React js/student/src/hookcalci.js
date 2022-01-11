import React, { useState } from 'react';

import ReactDOM from 'react-dom';
import './index.css';

 function HookCalculation(props){
  const [number1, setNumber1] = useState(0);
  const [number2, setNumber2] = useState(0);
  const[result,setResult] = useState(0);
  const handleResult = () =>{
    setResult(parseInt(number1)+parseInt(number2));
   // setResult(parseInt(number1)-parseInt(number2));
  }
  const handleSub = () =>{
    setResult(parseInt(number1)-parseInt(number2));
   // setResult(parseInt(number1)-parseInt(number2));
  }
  const handleMultiply = () =>{
    setResult(parseInt(number1)*parseInt(number2));
   // setResult(parseInt(number1)-parseInt(number2));
  }
  const handleDivision = () =>{
    setResult(parseInt(number1)/parseInt(number2));
   // setResult(parseInt(number1)-parseInt(number2));
  }

 // const [addition, setAdd] = useState(number1 + number2);
  //const [subtraction, setSub] = useState(number1 - number2);
  


  return (
    <div>
      <h1>Calculating Two Numbers</h1>
      <div>
      <input type="number"value={number1}onChange={e => setNumber1(+e.target.value)} placeholder="0"/>
        <input type="number"value={number2}onChange={e => setNumber2(+e.target.value)}placeholder="0"/>
      </div>
      <p> {number1} and {number2} is {result}</p>
      
      <button onClick={handleResult}>Addition</button>

      <button onClick={handleSub}>Subtraction</button>
      <button onClick={handleMultiply}>Multiplication</button>
      <button onClick={handleDivision}>Division</button>



     <h2>{setResult.calculateTotal}</h2>
     <h2>{setResult.calculateTotal}</h2>



     
      


      </div>
     
     
  )  

  }
 ReactDOM.render(  
  <HookCalculation  /> ,
document.getElementById('root')
);
   