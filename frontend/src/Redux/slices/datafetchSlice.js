import { createSlice } from '@reduxjs/toolkit';

export const dataFetchSlice = createSlice({
  name: 'fetch-data',
  initialState: [],
  reducers: {
    addData: (state, action) => {
      state.push(action.payload);
    },
  },
});

export const { addData } = dataFetchSlice.actions;

export default dataFetchSlice.reducer;
