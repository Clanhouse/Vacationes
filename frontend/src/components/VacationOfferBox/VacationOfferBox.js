import React from 'react';
import styles from './VacationOfferBox.module.scss';
import Text from 'components/Text';
import offerImage from 'assets/images/offer-image.webp';
import FavoritesBtn from 'components/FavoritesBtn/FavoritesBtn';

function VacationOfferBox(props) {
  return (
    <div className={styles.wrapper}>
      <FavoritesBtn />
      <div className={styles.imageWrapper}>
        <img className={styles.offerImage} src={offerImage} alt="" />
      </div>
      <div className={styles.descriptionWrapper}>
        <div className={styles.headingWrapper}>
          <Text big bold>
            {props.country}
          </Text>
          <div>
            <Text big bold>
              {props.price}, -
            </Text>
            <Text>/os.</Text>
          </div>
        </div>
        <Text bold>{props.city}</Text>
        <div className={styles.dateWrapper}>
          <Text>
            {props.startDate} - {props.endDate}
          </Text>
          <Text>|</Text>
          <Text>
            {props.startDate} - {props.endDate}
          </Text>
        </div>
        <div className={styles.hotelInfo}>
          <Text bold>{props.hotelName}</Text>
          <Text>
            np. all inclusive / wylot w cenie/ śniadanie łóżko dwuosobowe +
            łóżko jednoosobowe
          </Text>
        </div>
      </div>
    </div>
  );
}

export default VacationOfferBox;
