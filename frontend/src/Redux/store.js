import { configureStore } from '@reduxjs/toolkit';
<<<<<<< HEAD
import favouriteReducer from './slices/favouriteSlice';

export const store = configureStore({
  reducer: {
    favouriteReducer,
  },
});
=======
import favoriteReducer from './slices/favouriteSlice';
import dataFetchReducer from './slices/datafetchSlice';
import { persistStore, persistReducer } from 'redux-persist';
import storage from 'redux-persist/lib/storage';

const persistConfig = {
  key: 'root',
  storage,
  version: 1,
};

const persistReducers = persistReducer(persistConfig, favoriteReducer);

export const store = configureStore({
  reducer: {
    persistReducers,
    dataFetchReducer,
  },
});
export const persistor = persistStore(store);
>>>>>>> changedFavouriteList
