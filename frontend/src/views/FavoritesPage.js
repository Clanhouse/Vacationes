import { useEffect, useState } from 'react';
import VacationOffersList from 'components/VacationOffersList/VacationOffersList';
import Text from 'components/Text';

const FavoritesPage = () => {
  const [favorites, setFavorites] = useState([]);
  const [isLoading, setIsLoading] = useState(false);

  useEffect(() => {
    const getHolidayOffers = async () => {
      setIsLoading(true);
      const response = await fetch(
        'https://shrouded-sierra-07729.herokuapp.com/https://vacationes.herokuapp.com/api/holidays'
      );
      const data = await response.json();
      setFavorites(data.slice(0, 3));
      setIsLoading(false);
    };
    getHolidayOffers();
  }, []);
  return (
    <>
      {isLoading ? (
        <Text big bold>
          Loading...
        </Text>
      ) : (
        <VacationOffersList list={favorites} />
      )}
    </>
  );
};

export default FavoritesPage;
