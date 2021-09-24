import React from 'react';
import styles from './VacationOfferBox.module.scss';
import Text from 'components/Text';
import offerImage from 'assets/images/offer-image.webp';

function VacationOfferBox(props) {
  return (
    <div className={styles.wrapper}>
      <button className={`${styles.addToFavoritesBtn} ${styles.active}`}>
        <svg
          width="26"
          height="23"
          viewBox="0 0 26 23"
          fill="none"
          xmlns="http://www.w3.org/2000/svg"
        >
          <path
            d="M12.7616 21.8332C12.7616 21.8332 1.33301 15.7751 1.33301 7.69711C1.33301 4.4929 4.03014 1.56853 7.3194 1.89537C10.9473 2.25585 11.8151 4.79151 12.7616 6.78719C13.7081 4.79151 14.9582 2.44115 18.2038 1.89537C21.4493 1.34959 24.1901 4.4929 24.1901 7.69711C24.1901 15.7751 12.7616 21.8332 12.7616 21.8332Z"
            stroke="#2B2B2B"
            strokeWidth="1.8"
            strokeLinejoin="round"
          />
        </svg>
      </button>
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
