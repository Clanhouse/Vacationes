import React from 'react';
import ReactDOM from 'react-dom';
import 'reset.scss';
import 'index.scss';
import App from 'views/App';
import { store } from './Redux/store';
import { Provider } from 'react-redux';

ReactDOM.render(
  <React.StrictMode>
    <Provider store={store}>
      <App />
    </Provider>
  </React.StrictMode>,
  document.getElementById('root')
);
