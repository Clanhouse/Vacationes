import hero from 'assets/images/hero-image.svg';
import styles from './AuthTemplate.module.scss';

const AuthTemplate = ({ children }) => {
  return (
    <div className={styles.wrapper}>
      <img className={styles.heroImage} src={hero} alt="hero" />
      <div className={styles.formWrapper}>{children}</div>
    </div>
  );
};

export default AuthTemplate;
