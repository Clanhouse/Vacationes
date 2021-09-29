import { useState, useEffect } from 'react';
import SearchBar from 'components/SearchBar';
import Text from 'components/Text';
import VacationOffersList from 'components/VacationOffersList/VacationOffersList';
import styles from 'views/HomePage.module.scss';
import { useDispatch } from 'react-redux';
import { addData } from '../Redux/slices/datafetchSlice';

const HomePage = () => {
  const [holidayOffers, setHolidayOffers] = useState([]);
  const [isLoading, setIsLoading] = useState(false);
  const [loadingTakesLong, setLoadingTakesLong] = useState(false);
  const dispatch = useDispatch();

  useEffect(() => {
    const getHolidayOffers = async () => {
      setIsLoading(true);
      // if loading takes too long (heroku app sleeps), display information to the user
      let timeout = setTimeout(() => {
        setLoadingTakesLong(true);
      }, 3000);

      const response = await fetch(
        'https://shrouded-sierra-07729.herokuapp.com/https://vacationes.herokuapp.com/api/holidays'
      );
      const data = await response.json();

      // if response was successful, clear timeout and remove message
      if (response.ok) {
        clearTimeout(timeout);
        setLoadingTakesLong(false);
      }

      setHolidayOffers(data);
      setIsLoading(false);
    };

    getHolidayOffers();
  }, []);

  useEffect(() => {
    fetch(
      'https://shrouded-sierra-07729.herokuapp.com/https://vacationes.herokuapp.com/api/holidays'
    )
      .then((res) => res.json())
      .then((res) => dispatch(addData(res)))
      .catch((e) => console.log(e));
  }, []);

  return (
    <div>
      <SearchBar></SearchBar>
      <>
        <h1 className={styles.newOffersHeading}>Najnowsze okazje</h1>
        {loadingTakesLong ? (
          <p>Initial load may take a while. Heroku app is waking up...</p>
        ) : (
          ''
        )}
        {isLoading ? (
          <Text big bold>
            Loading...
          </Text>
        ) : (
          <VacationOffersList list={holidayOffers} />
        )}
      </>
    </div>
  );
};

export default HomePage;
