import React from 'react';

const Model = ({ onClose, results, data }) => {
  return(
    <div className="model is-active">
      <div className="model-background" onClick={onClose}></div>
      <div className="model-card">
        <header className="model-card-head">
          <p className="model-card-title">Your answers</p>
          <button className="delete" onClick={onClose}></button>
        </header>
        <section className="model-card-body content">
          <ul>
            {results.map((result, i) => (
              <li key={i} className="mb-6">
                <p><strong>{result.q}</strong></p>
                <p className={result.a === data[i].answer ? 'has-background-success has-text-white p-2' : 'has-background-danger has-text-white p-2'}>Your answer: {result.a}</p>
                {result.a !== data[i].answer && <p className="has-background-link has-text-white p-2">Correct answer: {data[i].answer}</p>}
              </li>
            ))}
          </ul>
        </section>
      </div>
    </div>
  );
}

export default Model;