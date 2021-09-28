import { createSlice } from '@reduxjs/toolkit';

const initialState = {
  value: [],
};

export const favouriteSlice = createSlice({
  name: 'favouriteList',
  initialState,
  reducers: {
    addItem: (state, action) => {
      state.value.push(action.payload);
    },
    removeItem: (state, payload) => {},
  },
});

export default favouriteSlice.reducer;
