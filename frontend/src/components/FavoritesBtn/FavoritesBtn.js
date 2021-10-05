import styles from './FavoritesBtn.module.scss';
<<<<<<< HEAD

const FavoritesBtn = ({ isFavorite = false }) => {
  return (
    <button
      className={`${styles.addToFavoritesBtn} ${
        isFavorite ? styles.active : ''
      }`}
    >
      <svg viewBox="0 0 25.5 23" fill="none" xmlns="http://www.w3.org/2000/svg">
        <path
          d="M12.7616 21.8332C12.7616 21.8332 1.33301 15.7751 1.33301 7.69711C1.33301 4.4929 4.03014 1.56853 7.3194 1.89537C10.9473 2.25585 11.8151 4.79151 12.7616 6.78719C13.7081 4.79151 14.9582 2.44115 18.2038 1.89537C21.4493 1.34959 24.1901 4.4929 24.1901 7.69711C24.1901 15.7751 12.7616 21.8332 12.7616 21.8332Z"
          stroke="#2B2B2B"
=======
import { useDispatch, useSelector } from 'react-redux';
import { addItem, removeItem } from 'Redux/slices/favouriteSlice';

const FavoritesBtn = ({ id, item }) => {
  const dispatch = useDispatch();
  const favoritesReducers = useSelector((state) => state.persistReducers.value);

  let idOfExistingItem = [];
  idOfExistingItem = favoritesReducers.map((item) => item.id);
  const onClickCurrentCard = (id) => {
    if (!idOfExistingItem.includes(id)) {
      dispatch(addItem(item));
    } else {
      dispatch(removeItem(id));
    }
  };

  // nie dziala removeItem? ? ?
  return (
    <button
      className={`${styles.addToFavoritesBtn} ${
        idOfExistingItem.includes(id) ? styles.active : ''
      }`}
      onClick={() => onClickCurrentCard(id)}
    >
      <svg
        viewBox="0 0 25.5 23"
        fill={idOfExistingItem.includes(id) ? '#fcf4ef' : 'none'}
        xmlns="http://www.w3.org/2000/svg"
      >
        <path
          d="M12.7616 21.8332C12.7616 21.8332 1.33301 15.7751 1.33301 7.69711C1.33301 4.4929 4.03014 1.56853 7.3194 1.89537C10.9473 2.25585 11.8151 4.79151 12.7616 6.78719C13.7081 4.79151 14.9582 2.44115 18.2038 1.89537C21.4493 1.34959 24.1901 4.4929 24.1901 7.69711C24.1901 15.7751 12.7616 21.8332 12.7616 21.8332Z"
          stroke={idOfExistingItem.includes(id) ? '#fcf4ef' : '#2B2B2B'}
>>>>>>> changedFavouriteList
          stroke-width="1.8"
          stroke-linejoin="round"
        />
      </svg>
    </button>
  );
};

export default FavoritesBtn;
