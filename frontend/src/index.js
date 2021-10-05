import React from 'react';
import ReactDOM from 'react-dom';
import 'reset.scss';
import 'index.scss';
import App from 'views/App';
<<<<<<< HEAD
import { store } from './Redux/store';
import { Provider } from 'react-redux';
=======
import { Provider } from 'react-redux';
import { PersistGate } from 'redux-persist/integration/react';
import { persistor } from './Redux/store';
import { store } from './Redux/store';
>>>>>>> changedFavouriteList

ReactDOM.render(
  <React.StrictMode>
    <Provider store={store}>
<<<<<<< HEAD
      <App />
=======
      <PersistGate persistor={persistor} loading={null}>
        <App />
      </PersistGate>
>>>>>>> changedFavouriteList
    </Provider>
  </React.StrictMode>,
  document.getElementById('root')
);
