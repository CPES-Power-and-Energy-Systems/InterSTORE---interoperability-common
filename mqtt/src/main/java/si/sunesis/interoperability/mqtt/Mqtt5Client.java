/*
 *  Copyright (c) 2023-2024 Sunesis and/or its affiliates
 *  and other contributors as indicated by the @author tags and
 *  the contributor list.
 *
 *  Licensed under the MIT License (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  https://opensource.org/licenses/MIT
 *
 *  The software is provided "AS IS", WITHOUT WARRANTY OF ANY KIND, express or
 *  implied, including but not limited to the warranties of merchantability,
 *  fitness for a particular purpose and noninfringement. in no event shall the
 *  authors or copyright holders be liable for any claim, damages or other
 *  liability, whether in an action of contract, tort or otherwise, arising from,
 *  out of or in connection with the software or the use or other dealings in the
 *  software. See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package si.sunesis.interoperability.mqtt;

import com.hivemq.client.mqtt.mqtt5.Mqtt5AsyncClient;
import lombok.extern.slf4j.Slf4j;

/**
 * @author David Trafela, Sunesis
 * @since 1.0.0
 */
@Slf4j
public class Mqtt5Client extends AbstractMqtt5RequestHandler {

    public Mqtt5Client(Mqtt5AsyncClient client) {
        super(client);
    }

    @Override
    public String processReplyRequest(String fromTopic, byte[] data) {
        return "processReplyRequest";
    }

    @Override
    public String processStreamRequest(String fromTopic, byte[] data) {
        return "processStreamRequest";
    }
}
