import VacationOffersList from 'components/VacationOffersList/VacationOffersList';
import { useSelector } from 'react-redux';

const FavoritesPage = () => {
  const favorites = useSelector((state) => state.persistReducers.value);

  return (
    <>
      <VacationOffersList list={favorites} />
    </>
  );
};

export default FavoritesPage;
