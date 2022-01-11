import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { AppProvider } from './context';
ReactDOM.render(
  <React.StrictMode>
  <AppProvider>
    <App />

  </AppProvider>
  </React.StrictMode>,
  document.getElementById('root')
);

reportWebVitals(console.log);

