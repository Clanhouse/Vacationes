import styles from './PageNotFound.module.scss';
import notFoundImage from 'assets/images/404.svg';
import Heading from 'components/Heading/Heading';
import Text from 'components/Text/Text';
import Button from 'components/Button/Button';
import { Link } from 'react-router-dom';

const PageNotFound = () => {
  return (
    <div className={styles.wrapper}>
      <div className={styles.heroImageWrapper}>
        <img className={styles.heroImage} src={notFoundImage} alt="hero" />
      </div>
      <div className={styles.formWrapper}>
        <Heading>Ups!</Heading>
        <Text>Coś poszło nie tak</Text>
        <Link to="/">
          <Button>Powrót do strony głównej</Button>
        </Link>
      </div>
    </div>
  );
};

export default PageNotFound;
