import VacationOfferBox from 'components/VacationOfferBox/VacationOfferBox';
import styles from './VacationOffersList.module.scss';

const VacationOffersList = ({ list }) => {
  return (
    <div className={styles.wrapper}>
      <>
        {list.map(
          ({
            destination: { country },
            flight: {
              destination: { city },
              price,
            },
            startDate,
            endDate,
            hotel: { name },
            id,
          }) => (
            <VacationOfferBox
              country={country}
              city={city}
              price={price}
              startDate={startDate}
              endDate={endDate}
              hotelName={name}
              key={id}
            />
          )
        )}
      </>
    </div>
  );
};

export default VacationOffersList;
