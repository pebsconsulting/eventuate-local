package io.eventuate.local.postgres.wal;

import io.eventuate.local.db.log.test.util.AbstractDuplicatePublishingDetectorTest;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("PostgresWal")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PostgresWalCdcIntegrationTestConfiguration.class)
public class DuplicatePublishingDetectorTest extends AbstractDuplicatePublishingDetectorTest {
}
