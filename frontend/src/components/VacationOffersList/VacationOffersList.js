import { useState } from 'react';
import VacationOfferBox from 'components/VacationOfferBox/VacationOfferBox';
import styles from './VacationOffersList.module.scss';
import { useDispatch, useSelector } from 'react-redux';
import { addItem, removeItem } from 'Redux/slices/favouriteSlice';

const VacationOffersList = ({ list }) => {
  return (
    <div className={styles.wrapper}>
      <>
        {list.map((item) => (
          <>
            <VacationOfferBox
              country={item.country}
              city={item.city}
              price={item.price}
              startDate={item.startDate}
              endDate={item.endDate}
              hotelName={item.name}
              key={item.id}
              id={item.id}
              item={item}
            />
          </>
        ))}
      </>
    </div>
  );
};

export default VacationOffersList;
