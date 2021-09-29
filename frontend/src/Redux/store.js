import { configureStore } from '@reduxjs/toolkit';
import favouriteReducer from './slices/favouriteSlice';
import dataFetchReducer from './slices/datafetchSlice';

export const store = configureStore({
  reducer: {
    favouriteReducer,
    dataFetchReducer,
  },
});
