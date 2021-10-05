import { createSlice } from '@reduxjs/toolkit';

export const favouriteSlice = createSlice({
  name: 'favouriteList',
  initialState: {
    value: [],
  },
  reducers: {
    addItem(state, { payload }) {
      state.value.push(payload);
    },
    removeItem: (state, { payload }) => {
      state.value = state.value.filter((item) => payload !== item.id);
    },
  },
});

export const { addItem, removeItem } = favouriteSlice.actions;

export default favouriteSlice.reducer;
