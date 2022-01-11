import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

class Calculator extends React.Component{
       constructor(){
           super();
           this.state ={
               num1 : 0,
               num2 : 0,
               addition :0,
               subtraction:0,
               multiply:0,
               division:0,
       }
       this.updateNum1=this.updateNum1.bind(this);
       this.updateNum2=this.updateNum2.bind(this);
       this.addition=this.addition.bind(this);
       this.subtraction=this.subtraction.bind(this);
       this.multiply=this.multiply.bind(this);
       this.division=this.division.bind(this);
       };
    
       updateNum1(event){
           this.setState({
               num1 : event.target.value

           });
       }
    
       updateNum2(event){
           this.setState({
               num2 : event.target.value
           });
       }
    
       addition(){
       this.setState({
         addition : parseInt(this.state.num1)+parseInt(this.state.num2)
       });
       }
       subtraction(){
         this.setState({
           subtraction : parseInt(this.state.num1)-parseInt(this.state.num2)
         })
       }
       multiply(){
         this.setState({
           multiplication : parseInt(this.state.num1)*parseInt(this.state.num2)
         });
         }
         division(){
           this.setState({
             division : parseInt(this.state.num1)/parseInt(this.state.num2)
           });
          }
    
    
       render(){
           return(
               <div>
                 <fieldset>
                   <legend>Simple Calculator</legend>
                   <input type ="number"  value={this.state.num1} 
                   onChange = {this.updateNum1} /><br></br>
                   <input type ="number"  value={this.state.num2} 
                   onChange = {this.updateNum2} /> <br></br>
    
    
                    <button onClick ={this.addition} >+</button>
                    <button onClick ={this.subtraction} >-</button>
                    <button onClick={this.multiply}>*</button>
                    <button onClick={this.division}>/</button> 
       
       
    
    
                   <h3>ADDITION:{this.state.addition}</h3> 
                 <h3>SUBTRACTION:{this.state.subtraction}</h3>
                   <h3>MULTIPLICATION:{this.state.multiply}</h3>
                   <h3>DIVISION:{this.state.division}</h3>
                 </fieldset>
               </div>
           );
       }   }
    
      const rootElement = document.getElementById("root");
      ReactDOM.render(<Calculator />, rootElement);
 