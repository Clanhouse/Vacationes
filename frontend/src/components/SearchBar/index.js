import React, { useState } from 'react';
import styles from './index.module.scss';
import airplane from '../../assets/images/searchBar/airplane.svg';
import umbrela from '../../assets/images/searchBar/umbrela.svg';
import plus from '../../assets/images/searchBar/plus.svg';
import search from '../../assets/images/searchBar/search.svg';

const SearchBar = () => {
  const [checkedIcon, setChecked] = useState(true);
  const [isDirectionClicked, setIsDirectionClicked] = useState(false);
  const [isDateClicked, setIsDateClicked] = useState(false);

  const directionBtn = (e) => {
    e.preventDefault();
    setIsDirectionClicked(!isDirectionClicked);
  };
  const dataBtn = (e) => {
    e.preventDefault();
    setIsDateClicked(!isDateClicked);
  };

  return (
    <div className={styles.wrapper}>
      <div className={styles.header}>Wyszukaj podróż</div>
      <form
        className={styles.selectWrapper}
        onSubmit={(res) => console.log(res)}
      >
        <ul>
          <li>
            <div
              className={`${styles.places} ${
                checkedIcon ? styles.checked : ''
              }`}
              onClick={() => setChecked(!checkedIcon)}
            >
              <img src={umbrela} alt="umbrela icon" />
              <input type="radio" id="places" name="finder" value="miejsca" />
              <label htmlFor="places"> miejsca</label>
            </div>
          </li>
          <li>
            <div
              className={`${styles.flights} ${
                checkedIcon ? '' : styles.checked
              }`}
              onClick={() => setChecked(!checkedIcon)}
            >
              <img src={airplane} alt="airplane icon" />
              <input type="radio" id="flights" name="finder" value="loty" />
              <label htmlFor="flights">loty</label>
            </div>
          </li>
        </ul>
        <div className={styles.formBar}>
          <button
            className={`${styles.dropDown} ${
              isDirectionClicked ? styles.checkedDirection : ''
            }`}
            onClick={(e) => directionBtn(e)}
          >
            Kierunek <img src={plus} alt="plus icon" />
          </button>
          <button
            className={`${styles.dropDown} ${
              isDateClicked ? styles.checkedDate : ''
            }`}
            onClick={(e) => dataBtn(e)}
          >
            Data <img src={plus} alt="plus icon" />
          </button>
          <button className={styles.searchBtn}>
            <img src={search} alt="search icon" />
            Szukaj
          </button>
        </div>
      </form>
      <div className={styles.searchForm}></div>
    </div>
  );
};

export default SearchBar;

// dokonczyc dodawanie checked do odpowiedniego inputa - oplesc labelem caly div
// sprawdzic czy nie za duze
