import { useEffect, useState } from 'react';
import VacationOffersList from 'components/VacationOffersList/VacationOffersList';
import Text from 'components/Text';
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
