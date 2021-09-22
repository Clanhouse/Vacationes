import React, { useState, useEffect } from 'react';
import styles from './index.module.scss';

const DirectionPicker = ({ directionPicker, isDirectionClicked }) => {
  const [selectedCheckboxes, setSelectedCheckboxes] = useState([]);

  const countries = [
    'Wszystko',
    'Polska',
    'Włochy',
    'Grecja',
    'Hiszpania',
    'Francja',
    'Anglia',
    'Szkocja',
    'Bułgaria',
    'Chorwacja',
  ];

  const onClickCheckbox = (value) => {
    if (selectedCheckboxes.includes(value)) {
      const index = selectedCheckboxes.indexOf(value);
      setSelectedCheckboxes(
        selectedCheckboxes.filter((el, idx) => idx !== index)
      );
    } else {
      setSelectedCheckboxes([...selectedCheckboxes, value]);
    }
  };

  useEffect(() => {
    directionPicker(selectedCheckboxes);
  }, [selectedCheckboxes]);
  return (
    <div
      className={styles.wrapper}
      style={{ display: `${isDirectionClicked ? '' : 'none'} ` }}
    >
      {countries.map((country, index) => (
        <div
          key={index}
          style={{
            backgroundColor: `${
              selectedCheckboxes.includes(country)
                ? 'rgba(255, 197, 144, 0.1)'
                : ''
            }`,
          }}
        >
          <label htmlFor={country}>
            <input
              type="checkbox"
              id={country}
              name={country}
              value={country}
              onClick={(e) => onClickCheckbox(e.target.value)}
            />
            <span className={styles.mark}></span>
            {country}
          </label>
        </div>
      ))}
    </div>
  );
};

export default DirectionPicker;
