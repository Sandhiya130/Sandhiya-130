import React, { useEffect, useState } from 'react';

//import { formatTime } from '../utils';

const End = ({ results, data, onReset, onAnswersCheck, time }) => {
  const [correctAnswers, setCorrectAnswers] = useState(0);

  useEffect(() => {
    let correct = 0;
    results.forEach((result, index) => {
      if(result.a === data[index].answer) {
        correct++;
      }
    });
    setCorrectAnswers(correct);
    // eslint-disable-next-line
  }, []);

  return(
    <div className="card">
      <div className="card-content">
        <div className="content">
          <h3>Your results</h3>
          <p>{correctAnswers} Out of {data.length}</p>
          <p>below 60% not eligible for next round</p>
          <p>You scored <strong>{Math.floor((correctAnswers / data.length) * 100)}%</strong></p>
          <button className="button is-info mr-2" onClick={onAnswersCheck}>Check your answers</button>
          
          <button className="button is-success" onClick={onReset}>Try again</button>
        </div>
      </div>
    </div>
  );
}

export default End;