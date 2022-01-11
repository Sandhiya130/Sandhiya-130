import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
class Currency extends React.Component
{
  constructor(props)
  {
    super(props);
    this.state = {
     value:"",
      currency: "",
      result:""
    };
    this.rupeeHandler = this.rupeeHandler.bind(this);
    this.yenHandler = this.yenHandler.bind(this);
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
   
  }
  handleChange(event){
    this.setState({value: event.target.value})
   
  }
  rupeeHandler(event)
  {
    this.setState(
      {currency: " Indian Rupees"}
    );
    this.setState(
      {result: this.state.value*75}
     );
    

  }
  yenHandler(event)
  {
    this.setState(
      {currency: "Yen"}
    );
    this.setState(
      {result: this.state.value*115}
     );
    
    
  }
  handleSubmit(event){
    alert(this.state.value+"Dollar is "+ this.state.result+ this.state.currency);
    event.preventDefault();
   
  }

  render()
  {const val=this.state.value;
    return(    <fieldset> <legend>Currency Conversion</legend>
      <form onSubmit={this.handleSubmit}>
        <lable>
          
          <input type="number"value={val} onChange={this.handleChange} placeholder= "Enter a number" /> <br></br> <br></br>
        </lable><button onClick={this.rupeeHandler}>Rupees</button><br></br>
    <button onClick={this.yenHandler}>Yen</button>
     </form></fieldset> 
    );
  }
}


ReactDOM.render(
  <Currency />,
  document.getElementById("root")
);