import React from 'react';

const Start = ({ onQuizStart }) => {
  return(
    <div className="card">
      <div className="card-content">
        <div className="content">
          <h1>Start the ReactJS quiz</h1>
          
          <h4>Time starts</h4>
          <h3>you have 6 questions to answer each question carries 1 mark. No negative marks</h3>
          <p>Good luck!</p>
          
          <button className="button is-info is-medium" onClick={onQuizStart}>Start</button>
        </div>
      </div>
    </div>
    
  );
}

export default Start;