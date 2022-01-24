import React from 'react';

import ReactDOM from 'react-dom';
import './index.css';
class Grade extends React.Component{
  constructor(){
    super();
    this.state={
      english:0,
      social:0,
      maths:0,
      total:'',
      grade:'',
    }
  }
  Markcapture=(event)=>{
     let n=event.target.name;
     let v=event.target.value;
     this.setState({[n]:v})
     
  }
  Grade=(event)=>{
    let totalmarks=parseInt(this.state.english)+parseInt(this.state.social)+parseInt(this.state.maths)
    this.setState({
     total:totalmarks
    });
    
    if((((this.state.total/3)*100)>50)&&(((this.state.total/3)*100)<70)){
      this.setState({
        grade:'B Grade'
      })
    }
    else if((((this.state.total/3)*100)>70)&&(((this.state.total/3)*100)<=100)){
      this.setState({
        grade:'A Grade'
      })
    }
    else{
      this.setState({
        grade:'Fail'
      })
    }
     
    
   
    
 
  }
 
 
 
   render(){
     return(
       <div>
     
          English:<input type="number" name="english" onChange={this.Markcapture}/><br></br>
          Social:<input type="number" name="social" onChange={this.Markcapture}/><br></br>
         Maths:<input type="number" name="maths" onChange={this.Markcapture}/><br></br>
         <button onClick={this.Grade}>Calculate Grade</button>
         
         <h3>Total:{this.state.total}</h3><br></br>
         <h3>Result:{this.state.grade}</h3>
        
        </div>
        
      
     )
   }
 }
 
     
 
 
 
 ReactDOM.render(  <Grade /> ,document.getElementById('root') );


