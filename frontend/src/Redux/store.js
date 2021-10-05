import { configureStore } from '@reduxjs/toolkit';
import favoriteReducer from './slices/favoriteSlice';
import dataFetchReducer from './slices/datafetchSlice';
import { persistStore, persistReducer } from 'redux-persist';
import storage from 'redux-persist/lib/storage';

const persistConfig = {
  key: 'root',
  storage,
  version: 1,
};

const persistReducers = persistReducer(persistConfig, favouriteReducer);

export const store = configureStore({
  reducer: {
    persistReducers,
    dataFetchReducer,
  },
});
export const persistor = persistStore(store);
